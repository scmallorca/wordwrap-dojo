def wrap(text, max_column):
    if max_column <= 0:
        raise ValueError("Max column not allowed")
    if max_column >= len(text):
        return text

    if text[max_column] == ' ':
        return text[:max_column] + '\n' + text[max_column+1:]

    index_blank = text[:max_column].rindex(' ')
    return text[:index_blank] + '\n' + wrap(text[index_blank+1:], max_column)
