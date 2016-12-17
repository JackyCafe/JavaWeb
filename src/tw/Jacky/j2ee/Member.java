package tw.Jacky.j2ee;


/* 
 * JavaBean
 *  1. implements Serialzable
 *  2. must be a public class 
 *  3  attriable can't not be public 
 * 
 * */

public class Member {
	private String id;
	private String name;
	
	
	
	public Member() {
		super();
 	}
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
