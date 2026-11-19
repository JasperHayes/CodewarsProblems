def brain_luck(code, program_input):
    input_bytes_arr = [ord(char) for char in program_input]
    loc = 0
    jumpback_stack = []
    jumpforward_stack = []

    for com in code:
        