package com.twschool.practice;
import org.junit.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Guess_Number_Test {
    @Test
    public void should_return_4A0B_when_given_1234 () {
        //given
        Guess_Number guess_Number=new Guess_Number();
        //when
        String num=guess_Number.set_Random_Not_Same();
        //then
        assertThat(num,is("4A0B"));
    }
//    @Test
//    public void should_return_2A2B_when_given_1243 () {
//        //given
//        Guess_Number guess_Number=new Guess_Number();
//        //when
//        String num=guess_Number.set_Random_Not_Same();
//        //then
//        assertThat(num,is("2A2B"));
//    }
//    @Test
//    public void should_return_1A2B_when_given_1543 () {
//        //given
//        Guess_Number guess_Number=new Guess_Number();
//        //when
//        String num=guess_Number.main("1234");
//        //then
//        assertThat(num,is("1A2B"));
//    }
//    @Test
//    public void should_return_0A4B_when_given_4321() {
//        //given
//        Guess_Number guess_Number=new Guess_Number();
//        //when
//        String num=guess_Number.main("1234");
//        //then
//        assertThat(num,is("0A4B"));
//    }
//    @Test
//    public void should_return_0A3B_when_given_2346 () {
//        //given
//        Guess_Number guess_Number=new Guess_Number();
//        //when
//        String num=guess_Number.main("1234");
//        //then
//        assertThat(num,is("0A3B"));
//    }
//    @Test
//    public void should_return_0A0B_when_given_5678 () {
//        //given
//        Guess_Number guess_Number=new Guess_Number();
//        //when
//        String num=guess_Number.main("1234");
//        //then
//        assertThat(num,is("0A0B"));
//    }
}
