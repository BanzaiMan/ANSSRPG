package disconsented.anssrpg.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import disconsented.anssrpg.common.Settings;
import disconsented.anssrpg.gui.PerkGUI;

public class ResponceHandler implements IMessageHandler<Responce, IMessage>{

	@Override
	public IMessage onMessage(Responce message, MessageContext ctx) {
		Settings.getInstance().setStatusMessage(message.responce);
		return null;
	}

}
