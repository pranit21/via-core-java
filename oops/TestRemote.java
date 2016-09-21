interface IDevice {
	public void plus();
	public void minus();
}

class TV implements IDevice {
	public void plus() {
		System.out.println("I increase volume by 1.");
	}
	
	public void minus() {
		System.out.println("I decrease volume by 1.");
	}
}

class AC implements IDevice {
	public void plus() {
		System.out.println("I increase temperature by 1.");
	}
	
	public void minus() {
		System.out.println("I decrease temperature by 1.");
	}
}

class Remote {
	private IDevice device;
	
	public void setDevice(IDevice d) {
		this.device = d;
	}
	
	public void up() {
		this.device.plus();
	}
	
	public void down() {
		this.device.minus();
	}
}

class TestRemote {
	public static void main(String[] args) {
		Remote r = new Remote();
		r.setDevice(new TV());
		r.up();
		r.down();
		
		r.setDevice(new AC());
		r.up();
		r.down();
	}
}