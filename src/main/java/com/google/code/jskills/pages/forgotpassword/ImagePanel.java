package com.google.code.jskills.pages.forgotpassword;

import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.resource.IResource;

public abstract class ImagePanel extends Panel {

	public ImagePanel(String id) {
		super(id);
		add(new Image("captchaImage") {
			private static final long serialVersionUID = 1L;

			@Override
			protected IResource getImageResource() {
				return ImagePanel.this.getImageResource();
			}
		});
	}

	public abstract IResource getImageResource();

}
