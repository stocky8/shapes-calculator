package org.cvtc.shapes;

/**
 * @author hstockdill
 *
 */
public class ShapeFactory {
	
	private Dialog messageBox;

	public ShapeFactory(Dialog messageBox) {
		setDialog(messageBox);
	}
	
	private void setDialog(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	private Dialog getDialog() {
		return this.messageBox;
	}
	
	public Renderer make(ShapeType type) {
		if(type == null) {
			return null;
		}
		if(type == ShapeType.Sphere) {
			return new Sphere(getDialog(), 5);
		}else if(type == ShapeType.Cylinder) {
			return new Cylinder(getDialog(), 5, 10);
		}else if(type == ShapeType.Cuboid) {
			return new Cuboid(getDialog(), 5, 5, 5);
		}
		
		return null;
	}

}
