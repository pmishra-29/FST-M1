#Make a two-player Rock-Paper-Scissors game.
#Remember the rules:
#Rock beats scissors
#Scissors beats paper
#Paper beats rock
while True:
    user1 = input("pick any one from Rock,Paper,Scissors for first player... ").lower()
    user2 = input("pick any one from Rock,Paper,Scissors for second player... ").lower()
#print (user1,user2)
    if((user1=='rock' and user2=='scissors') or (user1=='scissors' and user2=='paper') or (user1=='paper' and user2=='rock')) :
        print("User1 won the round !")
    else:
        print("User2 won the round !")

    repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
