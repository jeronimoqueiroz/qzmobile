package br.com.qzmobile.common.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;


public class AbstractEngineBean {
	
	@Override
    public String toString() {
        
		StringBuilder buffer = new StringBuilder();
        List<Field> fields = new LinkedList<Field>();

        getAllFields(fields, this.getClass());
        for (Field field : fields) {
            try {
            	field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(this);
                buffer.append(" ").append(name).append(": ").append(value);
            } catch (Throwable t) { /** vai para o próximo. */ }
        }
        return buffer.toString();
    }
   
	// --------------------------------------------------------------------------------
	
	public Object[] toUpdate() {
		
		List<Object> values = new LinkedList<Object>();
        List<Field> fields = new LinkedList<Field>();
        Object idValue = null;
        
        getAllFields(fields, this.getClass());
        for (Field field : fields) {
            try {
            	field.setAccessible(true);
                Object value = field.get(this);
                Id id = field.getAnnotation(Id.class);
            	if(id != null){
            		idValue = value;
            	}else{
            		Column column = field.getAnnotation(Column.class);
            		if(column != null){
            			values.add(value);
            		}
            	}
            } catch (Throwable t) { /** vai para o próximo. */ }
        }
        values.add(idValue);
        return values.toArray();
    }
	
	// --------------------------------------------------------------------------------
	
	public Object[] toInsert() {
		
		System.out.println("ENTROU");
		
		List<Object> values = new LinkedList<Object>();
        List<Field> fields = new LinkedList<Field>();
        
        getAllFields(fields, this.getClass());
        for (Field field : fields) {
            try {
            	field.setAccessible(true);
            	Id id = field.getAnnotation(Id.class);
            	Object value = field.get(this);
            	if(id == null || id.sequence() == null){
            		Column column = field.getAnnotation(Column.class);
            		if(column != null){
            			values.add(value);
            		}
            	}
            	
            } catch (Throwable t) { /** vai para o próximo. */ }
        }
        System.out.println("BAGACA:"+values.size());
        return values.toArray();
    }
	
	// --------------------------------------------------------------------------------
	
	public Object[] toPk() {
		
		List<Object> values = new LinkedList<Object>();
		List<Field> fields = new LinkedList<Field>();
        getAllFields(fields, this.getClass());
        for (Field field : fields) {
            try {
            	field.setAccessible(true);
                Object value = field.get(this);
                Id id = field.getAnnotation(Id.class);
            	if(id != null){
            		values.add(value);
            		break;
            	}
            } catch (Throwable t) { /** vai para o próximo. */ }
        }
        
        return values.toArray();    
    }
	
	// --------------------------------------------------------------------------------
	
    private void getAllFields(List<Field> fields, Class<?> clazz) {
        if (clazz != null) {
            for (Field field : clazz.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())
                        && !field.getType().isAssignableFrom(AbstractEngineBean.class)
                        && !field.getType().isAssignableFrom(Collection.class)
                        && !field.getType().isAssignableFrom(List.class)
                        && !field.getType().isAssignableFrom(Set.class)
                        && !field.getType().isAssignableFrom(Map.class)) {
                    fields.add(field);
                }
            }
            //getAllFields(fields, clazz.getSuperclass());
        }
    }

}
