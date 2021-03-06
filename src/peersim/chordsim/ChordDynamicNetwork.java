package peersim.chordsim;
import peersim.core.CommonState;
import peersim.core.Network;

import peersim.dynamics.DynamicNetwork;

public class ChordDynamicNetwork extends DynamicNetwork {

	public ChordDynamicNetwork(String prefix) {
		super(prefix);
	}

	protected void remove(int n){
		for(int i=0; i < n; i++){
			int index = CommonState.r.nextInt(Network.size());
			ChordProtocol cp = Utils.getChordFromNode(Network.get(index));
			System.out.println("Node " + cp.chordId + " died");
			Utils.NODES.remove(cp.chordId);
			Network.remove(index);
//			Network.get(inx.get(i)).setFailState(Fallible.DOWN);
		}
	}
}
