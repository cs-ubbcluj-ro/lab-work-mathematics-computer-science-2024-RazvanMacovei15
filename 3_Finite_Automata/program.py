import re

def read_fa(file_path):
    """
    Reads the finite automaton definition from the given file and returns its components.
    """
    with open(file_path, 'r') as file:
        lines = file.readlines()

    states = set(lines[0].strip().split(","))
    alphabet = set(lines[1].strip().split(","))
    transitions = {}
    for line in lines[2:-1]:
        src, symbol, dest = line.strip().split(",")
        if (src, symbol) not in transitions:
            transitions[(src, symbol)] = []
        transitions[(src, symbol)].append(dest)
    final_states = set(lines[-1].strip().split(","))

    return states, alphabet, transitions, final_states


def display_fa(states, alphabet, transitions, final_states):
    """
    Displays the finite automaton components.
    """
    print("Set of States: ", states)
    print("Alphabet: ", alphabet)
    print("Transitions: ")
    for (src, symbol), dests in transitions.items():
        print(f"  δ({src}, {symbol}) -> {', '.join(dests)}")
    print("Set of Final States: ", final_states)


def verify_string(states, alphabet, transitions, start_state, final_states, test_string):
    """
    Verifies if a given string is accepted by the finite automaton.
    """
    current_states = [start_state]

    for symbol in test_string:
        if symbol not in alphabet:
            return False
        next_states = []
        for state in current_states:
            if (state, symbol) in transitions:
                next_states.extend(transitions[(state, symbol)])
        current_states = next_states

        if not current_states:  # No valid transitions
            return False

    return any(state in final_states for state in current_states)


if __name__ == "__main__":
    # Read finite automaton from file
    file_path = "/Users/razvanmc15/Desktop/Facultate/an 3/comp networks/probleme_noi/probleme_comp_net/partial_com_network/tcp/lab3_lftc/FA.in"
    states, alphabet, transitions, final_states = read_fa(file_path)

    # Display finite automaton components
    display_fa(states, alphabet, transitions, final_states)

    # Bonus: Verify strings
    start_state = "q0"
    while True:
        test_string = input("Enter a string to verify (or 'exit' to quit): ")
        if test_string.lower() == "exit":
            break
        if verify_string(states, alphabet, transitions, start_state, final_states, test_string):
            print(f"The string '{test_string}' is accepted by the FA.")
        else:
            print(f"The string '{test_string}' is not accepted by the FA.")
