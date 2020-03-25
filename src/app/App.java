package app;

/**
 *  
 * <p><strong><em>Application Name: </em></strong>Program 3, Spell Checker</p>
 * <p><strong><em>Class Name: </em></strong>App</p>
 * 
 * <p><strong><em>Application Notes: </em></strong>none</p>
 *  
 * <p><strong><em>Class Notes: </em></strong>none</p>
 * 
 * <p><strong><em>Pre-Conditions: </em></strong>oliver.txt file must exist. dictionary.txt file must exist</p>
 * 
 * <p><strong><em>Post-Conditions: </em></strong>none</p>
 * 
 * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
 * <p><strong><em>Instructor: </em></strong>Dr. Robert Walsh</p>
 * <p><strong><em>Course: </em></strong>SP20-SE-CSCI-C202-17057</p>
 * <p><strong><em>Due Date: </em></strong>03.26.2020</p>
 * 
 */
public class App {

    /**
     * 
     * <p><strong><em>Description: </em></strong>application entry point</p>
     * 
     * <p><strong><em>Method Name: </em></strong>main</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>none</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>03.25.2020</p>
     *
     * @param args not used
     * @throws Exception not used
     */
    public static void main(String[] args) throws Exception {
        ReadFile.countSpellingErrors();
    }
}