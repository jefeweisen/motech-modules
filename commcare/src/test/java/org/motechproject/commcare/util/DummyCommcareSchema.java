package org.motechproject.commcare.util;

import org.motechproject.commcare.domain.FormSchemaJson;
import org.motechproject.commcare.domain.FormSchemaQuestionJson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class DummyCommcareSchema {

    public static final String FORM_QUESTION1 = "/data/pregnant";
    public static final String FORM_QUESTION2 = "/data/dob";
    public static final String FORM_QUESTION3 = "/data/patient_name";
    public static final String FORM_QUESTION4 = "/data/last_visit";
    public static final String FORM_QUESTION5 = "/data/medications";

    public static final String CASE_FIELD1 = "motherName";
    public static final String CASE_FIELD2 = "childName";
    public static final String CASE_FIELD3 = "dob";
    public static final String CASE_FIELD4 = "visitDate";
    public static final String CASE_FIELD5 = "isPregnant";

    public static List<FormSchemaJson> getForms() {
        List<FormSchemaJson> forms = new ArrayList<>();

        Map<String, String> formNames1 = new HashMap<>();
        Map<String, String> formNames2 = new HashMap<>();
        formNames1.put("en", "form1");
        formNames2.put("en", "form2");

        FormSchemaQuestionJson questionJson1 = new FormSchemaQuestionJson();
        questionJson1.setQuestionLabel("Is Pregnant?");
        questionJson1.setQuestionValue(FORM_QUESTION1);

        FormSchemaQuestionJson questionJson2 = new FormSchemaQuestionJson();
        questionJson2.setQuestionLabel("Date of birth");
        questionJson2.setQuestionValue(FORM_QUESTION2);

        FormSchemaQuestionJson questionJson3 = new FormSchemaQuestionJson();
        questionJson3.setQuestionLabel("Patient name");
        questionJson3.setQuestionValue(FORM_QUESTION3);

        FormSchemaQuestionJson questionJson4 = new FormSchemaQuestionJson();
        questionJson4.setQuestionLabel("Last visit");
        questionJson4.setQuestionValue(FORM_QUESTION4);

        FormSchemaQuestionJson questionJson5 = new FormSchemaQuestionJson();
        questionJson5.setQuestionLabel("Does patient take any medications?");
        questionJson5.setQuestionValue(FORM_QUESTION5);

        FormSchemaJson formSchemaJson1 = new FormSchemaJson();
        formSchemaJson1.setFormNames(formNames1);
        formSchemaJson1.setQuestions(Arrays.asList(questionJson1, questionJson2));

        FormSchemaJson formSchemaJson2 = new FormSchemaJson();
        formSchemaJson2.setFormNames(formNames2);
        formSchemaJson2.setQuestions(Arrays.asList(questionJson3, questionJson4, questionJson5));

        forms.add(formSchemaJson1);
        forms.add(formSchemaJson2);

        return forms;
    }

    public static Map<String, Set<String>> getCases() {
        Map<String, Set<String>> cases = new HashMap<>();
        Set<String> fields1 = new HashSet<>();
        Set<String> fields2 = new HashSet<>();

        fields1.add(CASE_FIELD1);
        fields1.add(CASE_FIELD2);
        fields1.add(CASE_FIELD3);

        fields2.add(CASE_FIELD4);
        fields2.add(CASE_FIELD5);

        cases.put("birth", fields1);
        cases.put("appointment", fields2);

        return cases;
    }
}
