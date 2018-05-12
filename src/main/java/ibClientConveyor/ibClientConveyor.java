package ibClientConveyor;

import Interface.Client;
import Interface.ClientConveyor;

public abstract class ibClientConveyor implements ClientConveyor {

	@Override
	public abstract Client createClient();
}
