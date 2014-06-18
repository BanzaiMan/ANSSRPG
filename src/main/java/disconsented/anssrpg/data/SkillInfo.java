package disconsented.anssrpg.data;
/**
 * @author James
 * Handles storing the information for each skill
 * Types:
 * 1 - Block breaking (OnBreakEvent)
 * 2 - Entity killing (onEntityDeath), not blocked
 * 3 - Crafting (onPlayerOpenContainer and onItemCraftedEvent) for blocking and exp respectivley 
 */

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class SkillInfo {
	
	public String name;
	public byte type; //Handles the skill type block breaking[1](onBreakEvent), Entity Damaging[2](), Crafting[3](ItemCraftedEvent),  
	public ArrayList exp, req = new ArrayList();
	public ArrayList<Item> itemName = new ArrayList<Item>();
	/**
	 * 
	 * @param exp
	 * @param req
	 * @param name 
	 * @param itemName
	 * @param type
	 */
	public SkillInfo(ArrayList exp, ArrayList req, String name, ArrayList itemName, byte type) {
		this.exp = exp;
		this.req = req;
		this.name = name;
		this.itemName = itemName;
		this.type = type;
	}

}