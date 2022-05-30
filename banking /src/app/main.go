package main

import (
	"encoding/json"
	"encoding/xml"
	"fmt"
	"net/http"

	"github.com/malli.ramesh/banking/sample"
)

func main() {

	http.HandleFunc("/greet", greet)

	http.HandleFunc("/customers", getCustomers)

	http.ListenAndServe("localhost:8000", nil)
}

func getCustomers(w http.ResponseWriter, r *http.Request) {
	customers := []sample.Customer{
		{Name: "king", City: "nellore", PinCode: "524086"},
		{Name: "queen", City: "nellore", PinCode: "524786"},
	}

	if r.Header.Get("Content-Type") == "application/xml" {
		w.Header().Add("Content-Type", "application/xml")
		xml.NewEncoder(w).Encode(customers)
	} else {
		w.Header().Add("Content-Type", "application/json")
		json.NewEncoder(w).Encode(customers)
	}

}

func greet(w http.ResponseWriter, r *http.Request) {
	fmt.Fprint(w, "first backend program in go")
}
