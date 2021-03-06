package cn.izern.hibernate.id;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "demo")
public class Demo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2765770852213608028L;

	private Long id;
	
	// other 

	@Id
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator", strategy = "cn.izern.hibernate.id.IDWorkerGenerator")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
