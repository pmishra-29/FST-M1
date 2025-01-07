# Calculator Test
# Using pytest:
# Create a new test file and write test to validate the following cases:
# Sum of two numbers
# Difference of two numbers
# Product of two numbers
# Quotient of two numbers

import pytest
import math

@pytest.mark.sum
def testsum():
    num1 = 10
    num2 = 18
    sum = num1+num2
    assert sum == 28

@pytest.mark.diff
def testdifference():
    num1 = 18
    num2 = 10
    sum = num1-num2
    assert sum == 8

@pytest.mark.activity22
def testmultiplication():
    num1 = 18
    num2 = 10
    sum = num1*num2
    assert sum == 180

@pytest.mark.activity22
def testdivision():
    num1 = 20
    num2 = 10
    sum = num1/num2
    assert sum == 2