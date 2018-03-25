import unittest
from wrapper import wrap


class WrapperTest(unittest.TestCase):

    def test_empty_text(self):
        self.assertEqual(wrap("", 2), "")

    def test_max_column_invalid(self):
        try:
            wrap("man", 0)
            self.fail()
        except ValueError as exception:
            self.assertEqual("Max column not allowed", exception.args[0])

    def test_max_column_equals_length_text(self):
        self.assertEqual(wrap("man woman", 9), "man woman")

    def test_max_column_equals_lowest_word_length_test(self):
        self.assertEqual(wrap("man woman", 3), "man\nwoman")

    def test_max_column_equals_than_first_two_words_length(self):
        self.assertEqual(wrap("man quarter woman", 11), "man quarter\nwoman")

    def test_max_column_greater_than_first_two_words_length(self):
        self.assertEqual(wrap("man quarter woman", 12), "man quarter\nwoman")

    def final_test(self):
        self.assertEqual(wrap("man man man a tree a man", 7), "man man\nman a\ntree a\nman")


if __name__ == '__main__':
    unittest.main()