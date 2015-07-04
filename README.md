#Stair case problem

This implementation provides solution for a stair case
of n steps. The person climbing the stairs is allowed to take
1 or 2 steps at at time.

So, for example for a stair case of 3 steps, the person has following options:-
Take all steps of magnitude 1 = (1,1,1)
Take mixed steps of magnitude 2 and 1 = (2,1) or (1,2)

So total number of ways to climb a stair case of 3 steps = 3.

Solution: For a person to reach step 5, he can reach from step 4 or step 3.

so,
 waysToReach(5) = waysToReach(4) + waysToReach(3)
 waysToReach(4) = waysToReach(3) + waysToReach(2)
 waysToReach(3) = waysToReach(2) + waysToReach(1)
 waysToReach(2) = waysToReach(1) + waysToReach(0)
 waysToReach(1) = waysToReach(0)
 waysToReach(0) = 1

Thus, waysToReach(5) = 8
