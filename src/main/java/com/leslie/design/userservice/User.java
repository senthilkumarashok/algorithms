package com.leslie.design.userservice;

public class User {
	
	private String name;
	private Long id;
	
	
	/*
	 * Constructor
	 */

	public User() {
		
	}
	
	public User(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	/*
	 * Getters
	 */
	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}
	
	
	/*
	 * Setters
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	
	
	/*
	 * HashCode & Equals
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
