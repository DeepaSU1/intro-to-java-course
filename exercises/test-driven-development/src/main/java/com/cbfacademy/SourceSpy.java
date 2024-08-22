
package com.cbfacademy;

class SourceSpy implements Source {
        private final String content;
        private int index = 0;

        public SourceSpy(String content){
            this.content = content;
        }

        @Override
        public char getChar(){
            return index < content.length() ? content.charAt(index++) : '\n';
        }
    }