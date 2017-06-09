package br.pro.hashi.ensino.desagil.lucianogic.model;

public class HalfGate extends Gate {
	
	private NandGate nandleft;
	private NandGate nandtop;
	private NandGate nandbot;
	private NandGate nandright;
	private NandGate nandbot2;

	
	public HalfGate() {
		super (2,2);
		
		name = "HALF";
		
		nandleft = new NandGate();
		nandtop = new NandGate();
		nandbot = new NandGate();
		nandright = new NandGate();
		nandleft = new NandGate();
		nandbot2 = new NandGate();
		
		nandtop.connect(nandleft, 1);
		nandbot.connect(nandleft, 0);
		nandright.connect(nandtop, 0);
		nandright.connect(nandbot, 1);
		nandbot2.connect(nandleft, 0);
		nandbot2.connect(nandleft, 1);

	}
	
	@Override
	public boolean doRead(int index) {
		if (index == 0) {
			return nandright.read();
		}
		else {
			return nandbot2.read();
		}
	}
	
	
	
	@Override
	protected void doConnect(Emitter emitter, int index) {
		if (index == 0) {
			nandleft.connect(emitter, 0);
			nandtop.connect(emitter, 0);
		}
		
		else {
			nandleft.connect(emitter, 1);
			nandbot.connect(emitter, 1);
		}	
	}
}
