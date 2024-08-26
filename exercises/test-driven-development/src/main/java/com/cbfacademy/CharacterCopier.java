
package com.cbfacademy;

public class CharacterCopier {
    private final Source source;
    private final Destination destination;

    public CharacterCopier(final Source source, final Destination destination) {
        this.source = source;
        this.destination = destination;
    }

    public void copy(){
        // throw new RuntimeException("Not implementary");
        final String character = this.source.getCharacter();
        this.destination.setCharacter(character);
    }

}