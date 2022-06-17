import codewars_test as test
import algo.sobriete_102 as sob
import algo.efficacite_13 as eff

def tests(fonction):
	@test.describe('Sample tests')
	def sample_tests():
		@test.it("erase: ''")
		def test1():
			test.assert_equals(fonction(''), '')
		
		@test.it("erase: '06   07 65 19 70 '")
		def test2():
			test.assert_equals(fonction('06   07 65 19 70 '), '06   07651970')
		
		@test.it("erase: '666, the number of the beast'")
		def test3():
			test.assert_equals(fonction('666, the number of the beast'), '666,thenumberofthebeast')

		@test.it("erase: 'Cou cou  J M  B'")
		def test4():
			test.assert_equals(fonction('Cou cou  J M  B'), 'Coucou  JM  B')

		@test.it("erase: 'OK'")
		def test4():
			test.assert_equals(fonction('OK'), 'OK')

		@test.it("erase: ' un '")
		def test4():
			test.assert_equals(fonction(' un '), 'un')

		@test.it("erase: '  deux  '")
		def test4():
			test.assert_equals(fonction('  deux  '), '  deux  ')

		@test.it("erase: ' . '")
		def test4():
			test.assert_equals(fonction(' . '), '.')


print('Test de sobriete_102')
tests(sob.erase)

print('\n\n\nTest de efficacite_13')
tests(eff.erase)
