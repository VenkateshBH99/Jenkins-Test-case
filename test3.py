import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

class PythonOrgSearch(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Firefox()

    def test_search_in_python_org(self):
        driver = self.driver
        driver.get("http://127.0.0.1:8000/register/")
        print(driver.title)
        self.assertIn("Index", driver.title)
        
     	#From
        from_elem = driver.find_element_by_name("username")
        print(from_elem)
        from_elem.send_keys("Ajit")
        

        passw = driver.find_element_by_name("password")
        passw.send_keys("123")

        email= driver.find_element_by_name("email")
        email.send_keys("ajit@gmail.com")

        number=driver.find_element_by_name("number")
        number.send_keys("7338496462")

        submit_button= driver.find_element_by_css_selector("input[value='Register']")
        submit_button.click()

        assert "No results found." not in driver.page_source
        


    def tearDown(self):
        self.driver.close()

if __name__ == "__main__":
    unittest.main()