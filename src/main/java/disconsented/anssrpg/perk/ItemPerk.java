/**
 * 
 */
package disconsented.anssrpg.perk;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.annotations.Expose;

import net.minecraft.item.Item;

/**
 * @author Disconsented
 *
 */
public class ItemPerk extends Perk {

	public ItemPerk(String name, ArrayList<Requirement> requirements,
			String description, int pointCost) {
		super(name, requirements, description, pointCost);
		// TODO Auto-generated constructor stub
	}

	public ItemPerk() {
		super();
	}

	Item item;
	@Expose
	String itemName = "default_itemName";
	
	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	protected void setItem(Item item) {
		this.item = item;
	}

	@Override
	public void touchUp() {
		// TODO Auto-generated method stub
		
	}

}
