/*group6380.Mozyakov; */

import Leson7.complex.Complex.java;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(Complex firstArg) {
        return new Calculator(firstArg);
    }
}