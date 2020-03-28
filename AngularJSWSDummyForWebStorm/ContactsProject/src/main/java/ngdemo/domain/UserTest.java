package ngdemo.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
// from http://www.vogella.com/articles/REST/
// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON
public class UserTest {

    private String error;
    private List<User> list;
    
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	} 
    
    

}
