/* 
 * Copyright (C) 2010 - Luciano Garcia Banuelos
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ee.ut.bpstruct.unfolding;

import java.util.Set;

import ee.ut.bpstruct.RestructurerHelper;
import ee.ut.bpstruct.unfolding.uma.BPstructBP;
import ee.ut.bpstruct.unfolding.uma.Unfolder_PetriNet;

import hub.top.petrinet.PetriNet;
import hub.top.uma.DNode;

public class Unfolder {
	private Unfolder_PetriNet unfolder;
	private RestructurerHelper helper;
	private Unfolding unfolding;

	public Unfolder(RestructurerHelper helper, PetriNet net) {
		this.helper = helper;
		this.unfolder = new Unfolder_PetriNet(net);
	}
	
	public Unfolding perform() {
		unfolder.computeUnfolding();
		BPstructBP unf = unfolder.getBP();
		Unfolding result =  unfolding = new Unfolding(helper, unf);		
		return result;
	}


	public Unfolding expand(Set<DNode> toExpand, int phase) {
		unfolding.expand(toExpand, phase);
		
		return unfolding;
	}
}
