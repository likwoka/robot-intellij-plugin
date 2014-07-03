package com.jivesoftware.robot.intellij.plugin.parser;

import com.jivesoftware.robot.intellij.plugin.lang.RobotPsiFile;
import com.jivesoftware.robot.intellij.plugin.psi.RobotKeyword;
import com.jivesoftware.robot.intellij.plugin.psi.RobotTestSetupSetting;
import org.junit.Test;

/**
 * Created by charles on 7/3/14.
 */
public class SettingsTableTests extends RobotParserTest {
    private static final String TEST_SETUP_SETTINGS =
            "*** Settings ***\n" +
                    " Test Setup      Foo Bar  ${baz}\n" +
                    " Test Precondition      Foo Bar  ${baz}\n" +
                    " Test Teardown   Abc Def\n" +
                    " Test Postcondition   Abc Def\n" +
                    " Suite Setup     Do Stuff  ${bar}  ${baz}\n" +
                    " Suite Precondition     Do Stuff  ${bar}  ${baz}\n" +
                    " Suite Teardown  Do more stuff\n" +
                    " Suite Postcondition  Do more stuff\n";

    private static final String SETUP_KEYWORDS_SAME_AS_SETTING_NAME =
            "*** Settings ***\n" +
                    " Test Setup      Test Setup  123\n" +
                    " Test Precondition      Test Precondition  123\n" +
                    " Test Teardown   Test Teardown\n" +
                    " Test Postcondition   Test Postcondition\n" +
                    " Suite Setup     Suite Setup  ${bar}  ${baz}\n" +
                    " Suite Precondition     Suite Precondition  ${bar}  ${baz}\n" +
                    " Suite Teardown  Suite Teardown\n" +
                    " Suite Postcondition  Suite Postcondition\n";

    private static final String TEST_SETUP_SETTINGS_WITH_SPACES_AND_CAPS =
            "*** Settings ***\n" +
                    " T E S T S E T U P      Foo Bar  ${baz}\n" +
                    " T E S T P R E C O N D I T I O N      Foo Bar  ${baz}\n" +
                    " T E S T T E A R D O W N   Abc Def\n" +
                    " T E S T P O S T C O N D I T I O N   Abc Def\n" +
                    " S U I T E S E T U P     Do Stuff  ${bar}  ${baz}\n" +
                    " S U I T E P R E C O N D I T I O N     Do Stuff  ${bar}  ${baz}\n" +
                    " S U I T E T E A R D O W N  Do more stuff\n" +
                    " S U I T E P O S T C O N D I T I O N  Do more stuff\n";

    @Test
    public void testSetupSettings() {
        RobotPsiFile file = doTestParseSucceeds(TEST_SETUP_SETTINGS);
        assertFileHasPsiElements(file, RobotTestSetupSetting.class, 8);
        assertFileHasPsiElements(file, RobotKeyword.class, 8);
    }

    @Test
    public void testSetupSettingsWithKeywordsSameAsSettingName() {
        RobotPsiFile file = doTestParseSucceeds(SETUP_KEYWORDS_SAME_AS_SETTING_NAME);
        assertFileHasPsiElements(file, RobotTestSetupSetting.class, 8);
        assertFileHasPsiElements(file, RobotKeyword.class, 8);
    }

    @Test
    public void testSetupSettingsWithSpacesAndCaps() {
        RobotPsiFile file = doTestParseSucceeds(TEST_SETUP_SETTINGS_WITH_SPACES_AND_CAPS);
        assertFileHasPsiElements(file, RobotTestSetupSetting.class, 8);
        assertFileHasPsiElements(file, RobotKeyword.class, 8);
    }
}
