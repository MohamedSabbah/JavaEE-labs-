package bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.model.SelectItem;

public class Memebers {
	private String name;
	private String password;
	private boolean visit;
	private String geneder;
	private String contact;
	private String mLang;
	private String country;
	private String []hobbys;
	private String hobbiesInString;
	
	private List<SelectItem> contactList;
	
	public List<SelectItem> getContactList() {
		this.contactList = new ArrayList<SelectItem>();
		SelectItem item = new SelectItem();
		item.setLabel("Mobile");
		item.setValue("Mobile");
		this.contactList.add(item);
		
		SelectItem item1 = new SelectItem();
		item.setLabel("Phone");
		item.setValue("Phone");
		this.contactList.add(item);
		
		SelectItem item2 = new SelectItem();
		item.setLabel("Email");
		item.setValue("Email");
		this.contactList.add(item);
		return contactList;
	}
	public void setContactList(List<SelectItem> contactList) {
		this.contactList = contactList;
	}
	public Memebers() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isVisit() {
		return visit;
	}
	public void setVisit(boolean visit) {
		this.visit = visit;
	}
	public String getGeneder() {
		return geneder;
	}
	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getmLang() {
		return mLang;
	}
	public void setmLang(String mLang) {
		this.mLang = mLang;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobbys() {
		return hobbys;
	}
	public void setHobbys(String[] hobbys) {
		this.hobbys = hobbys;
	}
	
	public String getHobbiesInString() {
		return 	Arrays.toString(hobbys);
		
	}
	
	

}
