class Prime(object):

    def is_prime(self, t):
        if t != 1:
            if t == 2:
                return True
            elif t % 2 == 0:
                return False
            else:
                for i in range(3, int(t ** (1 / 2)) + 1, 2):
                    if t % i == 0:
                        return False
                return True
        else:
            return False

    def list_of_primes(self, end, start=2):
        """Returns a list of primes till end integer,
with a start value"""
        answer = [i for i in range(start, end + 1) if self.is_prime(i)]
        return answer


