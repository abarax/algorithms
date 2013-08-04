
valid_input = '((()()))()'

invalid_input = '())'

bracket_stack = []

count = 0

for c in invalid_input:
    count = count + 1
    if (c == '('):
        bracket_stack.append((count, c))
    elif (c == ')'):
        if len(bracket_stack) == 0:
            bracket_stack.append((count, c))
            break
        bracket_stack.pop()

if (len(bracket_stack) != 0):
    print 'Invalid bracket here: ', bracket_stack
else:
    print 'Bracket formatting is valid'
