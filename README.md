# Airplane  Περιγραφή Εργασίας
Στο πλαίσιο αυτής της εργασίας θα πρέπει να αναπτυχθεί ένα μηχανογραφικό σύστημα για μια αεροπορική εταιρία. Ο στόλος της εταιρίας αποτελείται από αεροσκάφη που δεν κάνουν παραπάνω από μία πτήση την ημέρα. Για κάθε πτήση κλείνονται το πολύ τόσα εισιτήρια όσα είναι τα καθίσματα του αεροσκάφους. Να δημιουργηθούν οι ακόλουθες κλάσεις:
Κλάση Airplane (Αεροσκάφος), η οποία θα έχει σαν δεδομένα: έναν μοναδικό κωδικό, μια περιγραφή, τον αριθμό των σειρών (rows) και των στηλών (columns) των θέσεων του αεροσκάφους, και τον αριθμό των σειρών (rows) που είναι Business class.
1.	Abstract Κλάση Seat (Θέση), η οποία θα έχει σαν δεδομένα: έναν μοναδικό κωδικό, έναν αριθμό σειράς, έναν αριθμό στήλης και ένα εισιτήριο.
2.	Κλάση EconomySeat (Οικονομική θέση), η οποία κληρονομεί από την κλάση Seat και δεν έχει επιπλέον πεδία.
3.	Κλάση BusinessSeat (Πιο άνετη θέση και δυνατότητα παραγγελίας φαγητού κατά την πτήση), η οποία κληρονομεί από την κλάση Seat κι έχει ως επιπλέον πεδίο το μενού.
4.	Κλάση Menu (Μενού για τις BusinessSeat), η οποία έχει σαν πεδία έναν μοναδικό κωδικό, μια λίστα με κυρίως πιάτα, μια λίστα με επιδόρπια και μια λίστα με ποτά.
5.	Κλάση Flight (Πτήση), η οποία θα έχει ως δεδομένα: έναν μοναδικό κωδικό, την ημερομηνία και ώρα αναχώρησης του αεροσκάφους (τύπου LocalDate & LocalTime), αεροδρόμιο αναχώρησης, αεροδρόμιο προσγείωσης, το αεροσκάφος, έναν πίνακα διαστάσεων n x m τύπου Seat, όπου n και m οι σειρές και οι στήλες καθισμάτων του αεροσκάφους (αυτά λαμβάνονται από τα αντίστοιχα πεδία του αεροσκάφους), τον κωδικό μενού που διατίθεται στη πτήση, τον αριθμό των συνολικών θέσεων και τον αριθμό των κατειλημμένων θέσεων.
6.	Κλάση Ticket (Εισιτήριο), η οποία θα έχει ως δεδομένα έναν μοναδικό κωδικό, τον κωδικό πτήσης για την οποία  εκδίδεται  το  εισιτήριο, την  ημερομηνία  έκδοσης (LocalDate),  το  είδος  του  εισιτηρίου  (κανονικό, φοιτητικό κλπ.), το είδος της θέσης (economy, business), τιμή (int), ονοματεπώνυμο επιβάτη, και 3 πεδία για την παραγγελία από το διαθέσιμο μενού, ενός κυρίως πιάτου, ενός επιδόρπιου κι ενός ποτού.
8.	Κλάση Client (Εφαρμογή που χρησιμοποιεί ο υπάλληλος της αεροπορικής εταιρίας για να διαχειριστεί τα παραπάνω), η οποία θα περιέχει τη συνάρτηση main, η οποία µε τη χρήση ενός μενού που θα εμφανίζεται, θα μπορεί να εκτελεί τα ακόλουθα:
a.	Δημιουργία ενός νέου αντικειμένου της κλάσης Airplane
Εκτελείται όταν ο χρήστης εισάγει την τιμή 1. Αυτό θα συνεπάγεται τη δημιουργία νέων αντικειμένων (εκχώρηση τιμών στα πεδία µε βάση τιμές που εισάγει ο χρήστης από το πληκτρολόγιο) της κλάσης Airplane και καταχώρηση σε κατάλληλο πίνακα τύπου Airplane αν δεν έχει εκχωρηθεί παλαιότερα. Ο έλεγχος αυτός θα γίνεται µε βάση το πεδίο id µε µία επανάληψη που θα ελέγχει ένα προς ένα αν τα αντικείμενα της κλάσης Airplane του πίνακα έχουν πεδίο id ίδιο µε αυτό που εισήγαγε ο χρήστης. Αν δεν συμπίπτει, τότε το νέο αντικείμενο τύπου Airplane εισάγεται στον πίνακα και στη συνέχεια εκτυπώνεται ξανά το αρχικό μενού.
b.	Δημιουργία ενός νέου αντικειμένου της κλάσης Menu
Εκτελείται όταν ο χρήστης εισάγει την τιμή 2. Αυτό θα συνεπάγεται τη δημιουργία νέων αντικειμένων (εκχώρηση τιμών στα πεδία µε βάση τιμές που εισάγει ο χρήστης από το πληκτρολόγιο) της κλάσης Menu και καταχώρηση σε κατάλληλο πίνακα τύπου Menu αν δεν έχει εκχωρηθεί παλαιότερα το ίδιο μενού. Ο έλεγχος αυτός θα γίνεται µε βάση το πεδίο id µε µία επανάληψη που θα ελέγχει ένα προς ένα αν τα αντικείμενα της κλάσης Menu του πίνακα έχουν πεδίο id ίδιο µε αυτό που εισήγαγε ο χρήστης. Αν δεν συμπίπτει, τότε το νέο αντικείμενο τύπου Menu εισάγεται στον πίνακα και στη συνέχεια εκτυπώνεται ξανά το αρχικό μενού.
c.	Δημιουργία ενός νέου αντικειμένου της κλάσης Flight
Εκτελείται όταν ο χρήστης εισάγει την τιμή 3. Αυτό θα συνεπάγεται τη δημιουργία νέων αντικειμένων (εκχώρηση τιμών στα πεδία µε βάση τιμές που εισάγει ο χρήστης από το πληκτρολόγιο) της κλάσης Flight και καταχώρηση σε πίνακα τύπου Flight, αν δεν υπάρχει άλλη πτήση την ίδια μέρα στο ίδιο αεροσκάφος. Ο έλεγχος αυτός θα γίνεται µε βάση την ημερομηνία, και το αεροσκάφος µε µία επανάληψη που θα ελέγχει ένα προς ένα αν τα αντικείμενα της κλάσης Flight του πίνακα έχουν τα πεδία αυτά ίδια µε αυτά που εισήγαγε ο χρήστης. Για τη δημιουργία του αντικειμένου, ο χρήστης δίνει και τον κωδικό του αεροσκάφους. Αν δεν συμπίπτουν, τότε το νέο αντικείμενο τύπου Flight εισάγεται στον πίνακα και στη συνέχεια εκτυπώνεται ξανά το αρχικό μενού.
d.	Διαγραφή ενός νέου αντικειμένου της κλάσης Flight
Εκτελείται όταν ο χρήστης εισάγει την τιμή 4. Αυτό θα συνεπάγεται τη διαγραφή ενός αντικειμένου της κλάσης Flight με βάση τον  κωδικό  του.  Με την επιτυχή διαγραφή  του αντικειμένου, διαγράφονται και τα tickets της πτήσης και εμφανίζεται μια λίστα με τα ονόματα επιβατών και του ποσού που θα πρέπει να επιστραφεί σε κάθε έναν (η τιμή εισιτηρίου τους). Μετά εκτυπώνεται ξανά το αρχικό μενού.
e.	Δημιουργία ενός νέου αντικειμένου της κλάσης Ticket
Εκτελείται όταν ο χρήστης εισάγει την τιμή 5. Αυτό θα συνεπάγεται τη δημιουργία νέων αντικειμένων (εκχώρηση τιμών στα πεδία µε βάση τιμές που εισάγει ο χρήστης από το πληκτρολόγιο) της κλάσης Ticket που αφορούν συγκεκριμένη πτήση (πχ κωδικός πτήσης). Η δημιουργία και καταχώρηση των νέων αντικειμένων γίνεται σε πίνακα τύπου Ticket αν υπάρχει διαθέσιμη θέση για τη συγκεκριμένη πτήση και είδος θέσης. Με τη διαγραφή του αντικειμένου στη συνέχεια εκτυπώνεται ξανά το αρχικό μενού.
f.	Διαγραφή ενός αντικειμένου της κλάσης Ticket
Εκτελείται όταν ο χρήστης εισάγει την τιμή 6. Αυτό θα συνεπάγεται τη διαγραφή ενός αντικειμένου της κλάσης Ticket με βάση τον  κωδικό  του.  Με την επιτυχή δημιουργία  του αντικειμένου εκτυπώνεται ξανά το αρχικό μενού.
g.	Ενημέρωση των 3 πεδίων της κλάσης Ticket που αφορούν στην παραγγελία φαγητού, εφόσον το επιθυμεί ο κάτοχος του εισιτηρίου
Εκτελείται όταν ο χρήστης εισάγει την τιμή 7. Αρχικά ζητείται ο κωδικός του εισιτηρίου και αν η κράτηση αφορά BusinessSeat τότε του δίνεται η δυνατότητα επιλογής ενός κυρίως πιάτου, ενός επιδόρπιου και ενός ποτού από το μενού (Menu) που είναι διαθέσιμο για τη συγκεκριμένη πτήση και το οποίο τυπώνεται στην οθόνη του. Αφού επιλέξει, γίνεται ενημέρωση των αντίστοιχων πεδίων του αντικειμένου Ticket. Για τον έλεγχο του τύπου μιας θέσης ενδείκνυται η χρήση της μεθόδου instanceof που είναι ικανή να ελέγχει αν ένα αντικείμενο πχ Seat ανήκει στην κλάση EconomySeat ή BuisnessSeat. [https://docs.oracle.com/javase/tutorial/displayCode.html?code=https:// docs.oracle.com/javase/tutorial/java/nutsandbolts/examples/InstanceofDemo.java].
i.	Εμφάνιση Πληρότητας Αεροσκάφους για συγκεκριμένη Πτήση
Εκτελείται όταν ο χρήστης εισάγει την τιμή 8. Θα ζητείται από το πρόγραμμα ο κωδικός κάποιας πτήσης και στη συνέχεια θα εμφανίζεται ένας πίνακας όπου οι κατειλημμένες θέσεις θα μαρκάρονται με ‘[Χ]’ ενώ στις ελεύθερες θα εμφανίζεται κενό. Οι Business θέσεις θα εμφανίζονται με διπλά άγκιστρα ‘[[ ]]’ όπως φαίνεται στο παράδειγμα που ακολουθεί.
[[Χ]] [[  ]] [[Χ]]   
[[Χ]] [[  ]] [[  ]]   
 [Χ]    [  ]    [  ]   
 [  ]    [  ]    [ ]   
 [  ]    [  ]    [  ]   
j.	Έξοδος
Εκτελείται όταν ο χρήστης εισάγει την τιμή 0 και τερματίζει την εκτέλεση του προγράμματος.



Σημειώσεις:
1.	Σε όλες τις κλάσεις τα πεδία θα οριστούν ως private.
2.	Σε όλες τις κλάσεις θα οριστούν μέθοδοι setters και getters για τη θέση και την ανάκτηση των τιμών των πεδίων της εκάστοτε κλάσης.
3.	Κατά την κλήση ενός constructor είναι δυνατόν σε μια μεταβλητή να τεθεί το null, όταν δεν είναι διαθέσιμη η τιμή της μεταβλητής μέχρι εκείνη τη στιγμή της δημιουργίας του αντικειμένου.
4.	Σε κάθε κλάση, εκτός από την κλάση Flight (και ίσως και τη Menu), θα οριστεί ένας constructor με παραμέτρους όλα τα πεδία της κλάσης.
5.	Για την αποθήκευση όλων των αντικειμένων στην κλάση Client θα πρέπει να γίνει χρήση του ειδικού τύπου πίνακα ArrayList και των μεθόδων της κλάσης ArrayList add(object), get(index), size() και remove(index ή object).
6.	Παράδειγμα επαναληπτικού μενού εισαγωγής τιμών από το πληκτρολόγιο είναι το ακόλουθο:
[1] Insert Airplane
[2] Insert Menu
[3] Insert Flight
[4] Cancel Flight
[5] Book Ticket
[6] Cancel Ticket
[7] Order Menu Items (Available only in Business Seats) [8] Seats Capacity for a certain Flight
[0] Exit
