package com.group28.wwwjavafinal.entities;

public class Product extends BaseEntity {
	
	public enum Gender {
		None, Boy, Girl, Unisex;
		
		public static Gender parse(String target) {
			if (target.equalsIgnoreCase(Boy.toString()))
				return Boy;
			
			if (target.equalsIgnoreCase(Girl.toString()))
				return Girl;
			
			if (target.equalsIgnoreCase(Unisex.toString()))
				return Unisex;
			
			return None;
		}
	}
	
	private String name;
	private String description;
	private String imageUrl;
	private float price;
	private Gender gender;
	private int brandId;
	private int typeId;

	public Product() {
	}

	public Product(String name, String description, String imageUrl, Gender gender, int brandId, int typeId) {
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.gender = gender;
		this.brandId = brandId;
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
}
