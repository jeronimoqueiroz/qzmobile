package br.com.qzmobile.common.util;

import java.util.List;

import br.com.qzmobile.common.bean.MenuBean;

public class Menu {
	
	private MenuBean menu;
	
	
	private List<MenuItem> itens;

	public MenuBean getMenu() {
		return menu;
	}

	public void setMenu(MenuBean menu) {
		this.menu = menu;
	}

	public List<MenuItem> getItens() {
		return itens;
	}

	public void setItens(List<MenuItem> itens) {
		this.itens = itens;
	}
	
	

}
