
package com.cbfacademy;

/**
 * Represents an exception encountered when a filename isn't in the expected format.
 */

public class FilenameException extends Exception {
    public FilenameException(String message){
        super(message);
    }
}





















// class FileException {

//     public boolean check(String filename) throws FilenameException {
//         if (filename == null || filename.isEmpty()){
//             throw new FilenameException("Filename cannot be null or empty");
//         }
//         return filename.endsWith(".java");
//     }

//     public Map<String, Integer> map(List<String> filenames){
//         Map<String, Integer> result = new HashMap<>();
//         for (String filename : filenames){
//             try {
//                 result.put(filename, check(filename) ? 1 : 0);
//             } catch (FilenameException e){
//                 result.put(filename, -1);
//             }
//         }
//         return result;
//     }
// }