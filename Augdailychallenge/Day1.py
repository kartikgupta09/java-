class Solution:
    def countSeniors(self, details: List[str]) -> int:
        # count = 0
        count = 0
        for currstr in details:
            substr = currstr[11:13]  
            val = int(substr)
            if val > 60:
                count += 1
        
        return count
        
        