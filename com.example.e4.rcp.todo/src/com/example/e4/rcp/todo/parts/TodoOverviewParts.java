package com.example.e4.rcp.todo.parts;

import javax.annotation.PostConstruct;


import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class TodoOverviewParts {
	@PostConstruct
	public void createControls(Composite parent, EMenuService menuService) {
		
		TableViewer viewer = new TableViewer(parent, SWT.FULL_SELECTION | SWT.MULTI);
		
		menuService.registerContextMenu(viewer.getControl(), "com.example.e4.rcp.todo.popupmenu.table");
      
}
	
	@Execute
	public void execute(IEclipseContext context) {
	  // put an example value in the context
	  context.set("myactivePartId",
	  "com.example.e4.rcp.todo.part.todooverview");
	}

}
