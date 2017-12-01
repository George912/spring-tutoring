package chapter3.collection_injection;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("oracle")
public class BookWormOracle implements Oracle {
    private static final Logger LOGGER = Logger.getLogger(BookWormOracle.class);

    @Override
    public String defineMeaningOfLife() {
        LOGGER.debug("call defineMeaningOfLife()");
        return "Encyclopedias are а waste of money - use the Internet";
    }
}
