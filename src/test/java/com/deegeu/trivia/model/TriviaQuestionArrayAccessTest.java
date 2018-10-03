package com.deegeu.trivia.model;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Date;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TriviaQuestionArrayAccessTest {
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        long index = 1;
        TriviaQuestionArrayAccess instance = new TriviaQuestionArrayAccess();
        TriviaQuestion expResult = (new TriviaQuestionBuilder())
                .id(1)
                .question("What was the first toy advertised on television?")
                .answerA("The Rubix Cube")
                .answerB("Mr. Potato Head")
                .answerC("Barbie")
                .answerD("A hula hoop")
                .correctAnswer("B")
                .hint("Use your head on this one")
                .lastUpdated(new Date())
                .build();
        TriviaQuestion result = instance.getQuestionById(index);
        assertEquals("Trivia questions 1 do not match in ::getQuestion().", expResult.getId(), result.getId());
    }

    @Test
    public void testGetRandomQuestion() {
        System.out.println("getRandomQuestion");
        TriviaQuestionArrayAccess instance = new TriviaQuestionArrayAccess();
        TriviaQuestion result = instance.getRandomQuestion();
        assertNotNull("A random question was not returned in ::getRandomQuestion().", result);
    }

    @Test
    public void testGetQuestionList() {
        System.out.println("getQuestionList");
        long offset = 0L;
        TriviaQuestionArrayAccess instance = new TriviaQuestionArrayAccess();
        List<TriviaQuestion> result = instance.getQuestionList(offset);

        assertNotEquals("Trivia question list not returned in ::getQuestionList.", result);
        assertEquals(10, result.size());
    }

    @Test
    public void testGetQuestionListSize() {
        System.out.println("getQuestionListSize");
        TriviaQuestionArrayAccess instance = new TriviaQuestionArrayAccess();
        long expResult = 11;
        long result = instance.getQuestionListSize();
        assertEquals("There should only be 11 trivia questions in ::getQuestionListSize.", expResult, result);
    }

    @Test
    public void getQuestionsBySpecifiedList(){

        TriviaQuestionArrayAccess instance = new TriviaQuestionArrayAccess();

        List<TriviaQuestion> questionList = instance.getSpecifiedQuestionList(0L, 1L, 2L);

        List<Long> actual = questionList.stream()
                                        .map(TriviaQuestion::getId)
                                        .collect(Collectors.toList());

        List<Long> expected = Arrays.asList(0L, 1L, 2L);
        assertTrue(actual.containsAll(expected));

    }

}
