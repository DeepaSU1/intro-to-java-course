
package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The character copier should")
public class CharacterCopierTest {
    
    @Test
    @DisplayName("copy a character from the source to the destination")

    void copyFromSourceToDestination(){
        final SourceSpy source = new SourceSpy();
        final DestinationSpy destination = new DestinationSpy();
        final CharacterCopier copier = new CharacterCopier(source, destination);

        copier.copy();

        assertTrue(source.wasCalled());
        assertTrue(destination.wasCalled());
    }
}