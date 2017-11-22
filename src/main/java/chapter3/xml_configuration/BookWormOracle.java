package chapter3.xml_configuration;

import org.apache.log4j.Logger;

public class BookWormOracle implements Oracle {
    private static final Logger LOGGER = Logger.getLogger(BookWormOracle.class);

    @Override
    public String defineMeaningOfLife() {
        LOGGER.debug("call defineMeaningOfLife()");
        return "Encyclopedias are а waste of money - use the Internet";
    }
}
