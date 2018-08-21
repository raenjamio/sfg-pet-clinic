package raenjamio.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMapService<T, ID> {

	protected Map<ID, T> map = new HashMap<>();
	
	
}
