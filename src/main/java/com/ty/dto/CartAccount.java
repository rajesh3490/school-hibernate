package com.ty.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CartAccount {

	@EmbeddedId
	private AccountId accountId;

	public CartAccount() {
		super();
	}

	public AccountId getAccountId() {
		return accountId;
	}

	public void setAccountId(AccountId accountId) {
		this.accountId = accountId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String name;
	private String password;
	private String gender;
}
