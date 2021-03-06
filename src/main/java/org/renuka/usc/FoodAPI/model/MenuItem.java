package org.renuka.usc.FoodAPI.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "MenuItem")
public class MenuItem {

    private String menuItemId;
    private String name;
    private String description;
    private String isVeg;
    private Double price;
    private String menuId;
    private String restaurantId;

	/*public MenuItem() {
		// TODO Auto-generated constructor stub
	}

	public MenuItem(String itemId, String name, String description, Boolean isVeg, Double price, String menuId,
			String restaurantId) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.isVeg = isVeg;
		this.price = price;
		this.menuId = menuId;
		this.restaurantId = restaurantId;
	}*/

    @DynamoDBHashKey(attributeName = "MenuItemId")
    public String getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(String itemId) {
        this.menuItemId = itemId;
    }

    @DynamoDBAttribute(attributeName = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute(attributeName = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @DynamoDBAttribute(attributeName = "IsVeg")
    public String getIsVeg() {
        return isVeg;
    }

    public void setIsVeg(String isVeg) {
        this.isVeg = isVeg;
    }

    @DynamoDBAttribute(attributeName = "Price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @DynamoDBAttribute(attributeName = "MenuId")
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @DynamoDBAttribute(attributeName = "RestaurantId")
    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

	@Override
	public String toString() {
		return "MenuItem [menuItemId=" + menuItemId + ", name=" + name + ", description=" + description + ", isVeg="
				+ isVeg + ", price=" + price + ", menuId=" + menuId + ", restaurantId=" + restaurantId + "]";
	}
    
    
}
