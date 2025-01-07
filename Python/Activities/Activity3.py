#Make a two-player Rock-Paper-Scissors game.
#Remember the rules:
#Rock beats scissors
#Scissors beats paper
#Paper beats rock

user1 = input("pick any one from Rock,Paper,Scissors for first player... ").lower()
user2 = input("pick any one from Rock,Paper,Scissors for second player... ").lower()
#print (user1,user2)
if((user1=='rock' and user2=='scissors') or (user1=='scissors' and user2=='paper') or (user1=='paper' and user2=='rock')) :
        print("User1 won the round !")
else:
        print("User2 won the round !")

