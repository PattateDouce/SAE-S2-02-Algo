from solution import erase
import codewars_test as test

@test.describe('Sample tests')
def sample_tests():
    @test.it("erase: ''")
    def test1():
        test.assert_equals(erase(''), '')
    
    @test.it("erase: '06   07 65 19 70 '")
    def test2():
        test.assert_equals(erase('06   07 65 19 70 '), '06   07651970')
    
    @test.it("erase: '666, the number of the beast'")
    def test3():
        test.assert_equals(erase('666, the number of the beast'), '666,thenumberofthebeast')

    @test.it("erase: 'Cou cou  J M  B'")
    def test4():
        test.assert_equals(erase('Cou cou  J M  B'), 'Coucou  JM  B')
