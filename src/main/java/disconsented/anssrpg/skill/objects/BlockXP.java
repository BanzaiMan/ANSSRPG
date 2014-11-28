/**
 * 
 */
package disconsented.anssrpg.skill.objects;

import com.google.gson.annotations.Expose;

import net.minecraft.block.Block;

/**
 * @author Disconsented
 *
 */
public class BlockXP extends XPGain {

	/**
	 * 
	 */
	private Block block;
	
	public BlockXP() {
	}

	@Override
	public void touchUp() {
		block = (Block) Block.blockRegistry.getObject(name);

	}

	public Block getBlock() {
		return block;
	}

}
