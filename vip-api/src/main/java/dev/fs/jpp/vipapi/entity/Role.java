package dev.fs.jpp.vipapi.entity;

public enum Role {
	ADMIN(1),
	RRPP(2),
	RECEPTIONIST(3);
	
	private int id;
	
	private Role(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
