package placement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Certificate 
{
private Integer cf_id;
private String cf_title;
private String cf_name;
private int cf_issuedate;
private int cf_expiredate;


public Certificate() 
{
	super();
}
public Certificate(Integer cf_id, String cf_title, String cf_name, int cf_issuedate, int cf_expiredate) {
	super();
	this.cf_id = cf_id;
	this.cf_title = cf_title;
	this.cf_name = cf_name;
	this.cf_issuedate = cf_issuedate;
	this.cf_expiredate = cf_expiredate;
}

@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
public Integer getCf_id() {
	return cf_id;
}
public void setCf_id(Integer cf_id) {
	this.cf_id = cf_id;
}
public String getCf_title() {
	return cf_title;
}
public void setCf_title(String cf_title) {
	this.cf_title = cf_title;
}
public String getCf_name() {
	return cf_name;
}
public void setCf_name(String cf_name) {
	this.cf_name = cf_name;
}
public int getCf_issuedate() {
	return cf_issuedate;
}
public void setCf_issuedate(int cf_issuedate) {
	this.cf_issuedate = cf_issuedate;
}
public int getCf_expiredate() {
	return cf_expiredate;
}
public void setCf_expiredate(int cf_expiredate) {
	this.cf_expiredate = cf_expiredate;
}
@Override
public String toString() {
	return "Certificate [cf_id=" + cf_id + ", cf_title=" + cf_title + ", cf_name=" + cf_name + ", cf_issuedate="
			+ cf_issuedate + ", cf_expiredate=" + cf_expiredate + "]";
}


}
