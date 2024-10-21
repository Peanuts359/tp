package seedu.address.testutil;

import seedu.address.model.event.Event;

/**
 * A utility class containing a list of {@link Event} objects to be used in tests.
 */
public class TypicalEvents {
    // in typicaladdressbook.json
    public static final Event IFG = new EventBuilder().withName("IFG").build();
    public static final Event AUG = new EventBuilder().withName("AUG").build();
    public static final Event SUNIG = new EventBuilder().withName("SUNIG").build();
    public static final Event IVP = new EventBuilder().withName("IVP").build();

    // Manually added
    public static final Event WUG = new EventBuilder().withName("WUG").build();
    public static final Event WUC = new EventBuilder().withName("WUC").build();
}
