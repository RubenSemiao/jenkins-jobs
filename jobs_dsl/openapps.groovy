import hudson.plugins.git.*;

def scm = new GitSCM("https://github.com/RubenSemiao/jenkins-jobs.git")
scm.branches = [new BranchSpec("*/master")];

def flowDefinition = new org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition(scm, "openapps/Jenkinsfile")

def parent = Jenkins.instance
def job = new org.jenkinsci.plugins.workflow.job.WorkflowJob(parent, "openapps")
job.definition = flowDefinition

parent.reload()